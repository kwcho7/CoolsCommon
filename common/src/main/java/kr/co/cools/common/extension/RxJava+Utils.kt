package kr.co.cools.common.extension

import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.internal.schedulers.NewThreadScheduler

fun Disposable.disposableBag(compositeDisposable: CompositeDisposable) : Disposable {
    compositeDisposable.add(this)
    return this
}

fun <T> Single<T>.asDriver() : Single<T> {
    return subscribeOn(NewThreadScheduler()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Observable<T>.asDriver() : Observable<T> {
    return subscribeOn(NewThreadScheduler()).observeOn(AndroidSchedulers.mainThread())
}

fun <T> Flowable<T>.asDriver() : Flowable<T> {
    return subscribeOn(NewThreadScheduler()).observeOn(AndroidSchedulers.mainThread())
}

fun Completable.asDriver() : Completable {
    return subscribeOn(NewThreadScheduler()).observeOn(AndroidSchedulers.mainThread())
}