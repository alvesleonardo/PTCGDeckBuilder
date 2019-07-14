package com.leonardoalves.data_common.util

import com.leonardoalves.data_common.issues.RemoteIntegrationIssue
import io.reactivex.Observable
import io.reactivex.ObservableTransformer
import java.io.IOException

internal class HandleSerializationError<T> : ObservableTransformer<T, T> {

    override fun apply(upstream: Observable<T>): Observable<T> {
        return upstream.onErrorResumeNext(this::handleSerializationError)
    }

    private fun handleSerializationError(error: Throwable): Observable<T> {
        val mapped = when (error) {
            is IOException -> RemoteIntegrationIssue.UnexpectedResponse
            else -> error
        }
        return Observable.error(mapped)
    }
}