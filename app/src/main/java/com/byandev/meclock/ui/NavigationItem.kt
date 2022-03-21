package com.byandev.meclock.ui

import com.byandev.meclock.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Alarm : NavigationItem("Alarm", R.drawable.ic_baseline_alarm_24, "Alarm")
    object WorldClock : NavigationItem("WorldClock", R.drawable.ic_baseline_access_time_24, "World Clock")
    object Stopwatch : NavigationItem("Stopwatch", R.drawable.ic_baseline_timer_24, "Stopwatch")
}
