package com.example.smarthome

import android.icu.util.TimeUnit
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.databinding.DataBindingUtil
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.example.smarthome.ui.theme.SmarthomeTheme

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModal by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
        findNavController().navigate(R.id.action_mainFragment_to_settingsFragment)

        // Handle other setup
        val workRequest = PeriodicWorkRequestBuilder<SyncWorker>(15, TimeUnit.MINUTE)
            .build()
        WorkManager.getInstance(this).enqueue(workRequest)
        val automationRequest = OneTimeWorkRequestBuilder<AutomationWorker>()
            .setInitialDelay(1, TimeUnit.HOUR) // Example delay
            .build()
        WorkManager.getInstance(this).enqueue(automationRequest)
    }
}