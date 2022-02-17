# meta-clusterctrl
Yocto meta layer for ClusterHAT (Work in progress)

## Guide
Use [this](https://jumpnowtek.com/rpi/Raspberry-Pi-Systems-with-Yocto.html) as base and add this layer for ClusterHAT support by adding the following to your local.conf:

    IMAGE_INSTALL += " clusterctrl"
