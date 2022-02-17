# meta-clusterctrl
Yocto meta layer for ClusterHAT (Work in progress)

## Guide
Use [this](https://jumpnowtek.com/rpi/Raspberry-Pi-Systems-with-Yocto.html) as base and add this layer for ClusterHAT support by adding it to the bblayers.conf and local.conf.

## bblayers.conf
    ${HOME}/poky-dunfell/meta-clusterctrl \

## local.conf
    IMAGE_INSTALL += " clusterctrl"
    
    # I2C driver
    ENABLE_I2C = "1"
    KERNEL_MODULE_AUTOLOAD_rpi += " i2c-dev i2c-bcm2708"

