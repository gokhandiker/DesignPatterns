package com.gkhn.designpatterns.structural.adapter.example2

class LightningToMicroUsbAdapter(private val lightningPhone: LightningPhone) : MicroUsbPhone {

    override fun reCharge() {
       lightningPhone.reCharge()
    }

    override fun useMicroUsb() {
       println("MicroUsb connected!")
        lightningPhone.useLightning()
    }
}