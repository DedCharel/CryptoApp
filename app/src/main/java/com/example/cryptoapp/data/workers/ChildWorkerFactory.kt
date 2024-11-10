package com.example.cryptoapp.data.workers

import android.content.Context
import androidx.work.ListenableWorker
import androidx.work.WorkerParameters

interface ChildWorkerFactory {

    fun onCreate(context: Context, workerParameters: WorkerParameters): ListenableWorker
}