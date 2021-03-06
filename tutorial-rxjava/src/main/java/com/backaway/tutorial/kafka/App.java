package com.backaway.tutorial.kafka;

import rx.Observable;
import rx.Subscriber;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Observable.create(new Observable.OnSubscribe<Integer>() {
			@Override
			public void call(Subscriber<? super Integer> observer) {
				try {
					if (!observer.isUnsubscribed()) {
						for (int i = 1; i < 5; i++) {
							observer.onNext(i);
						}
						observer.onCompleted();
					}
				} catch (Exception e) {
					observer.onError(e);
				}
			}
		}).subscribe(new Subscriber<Integer>() {
			@Override
			public void onNext(Integer item) {
				System.out.println("Next: " + item);
			}

			@Override
			public void onError(Throwable error) {
				System.err.println("Error: " + error.getMessage());
			}

			@Override
			public void onCompleted() {
				System.out.println("Sequence complete.");
			}
		});
	}
}
