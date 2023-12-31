## 驱动

在 `DC3` 中所谓的 **驱动**，主要意义在于 `主动获取或者接设备数据` 以及 `控制设备`（`前提是设备支持被程序控制`），他实际上是一套程序逻辑（`主要借助Java实现`）。

把 `主动获取（被动接收）设备数据` 和 `控制` 不同类型设备的这套程序逻辑叫做 **驱动**，并把该套程序逻辑按照不同类型的设备进行归纳为不同的 **驱动模块**，从而有了 `dc3-driver-opc-da`、`dc3-driver-opc-ua`、`dc3-driver-mqtt`、`dc3-driver-modbus-tcp`、`dc3-driver-plcs7` 等。

## 设备

**设备**，是一个宽泛的概念，把能接入到 `DC3` 中的 `手机`、`电脑`、`服务器`、`网关`、`硬件设备`甚至是某个`软件程序`等，都可以统称为 **设备** 。

## 位号

在 `DC3` 中 `位号` 是用于定义设备某些属性的，一个 `位号` 能定义该 `设备` 某个属性所需的基本参数。

例如：某个设备有温度、压力、方向、速度等属性，这些统称为 `位号`

## 模版

`模版` 是一组 `位号` 的集合，当一个 `模版` 被某个 `设备` 继承时，该 `设备` 同时也拥有了该 `模版` 下全部的 `位号` ，一个 `模版` 可以被多个 `设备` 继承，一个 `设备` 可以同时继承多个 `模版` 。
