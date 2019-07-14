package com.leonardoalves.data_common

import com.leonardoalves.data_common.util.HandleConnectivityIssue
import com.leonardoalves.data_common.util.HandleErrorByHttpStatus
import com.leonardoalves.data_common.util.HandleSerializationError
import io.reactivex.Observable
import io.reactivex.ObservableTransformer

class ExecutionErrorHandler<T>: ObservableTransformer<T, T> {

    override fun apply(upstream: Observable<T>): Observable<T> =
        upstream
            .compose(HandleErrorByHttpStatus())
            .compose(HandleConnectivityIssue())
            .compose(HandleSerializationError())

}