package com.example.koinsample

import com.example.koinsample.weather.IWeather


class FakeWeather: IWeather {
    var fakeIsSunny = false // 建立屬性，讓外部可設定假的天氣要回傳晴天或雨天

    override fun isSunny(): Boolean {
        return fakeIsSunny // 回傳設定的假天氣
    }
}