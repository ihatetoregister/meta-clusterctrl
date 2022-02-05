#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Control application for ClusterHAT"
SECTION = "clusterctrl"
DEPENDS = ""
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bb6e931b02e57931863cefb015ae046c"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRCREV = "b1530274206291d993185951608e4f4ea3d11e49"
SRC_URI = "git://github.com/burtyb/clusterhat-image.git"

S = "${WORKDIR}/git"

#inherit autotools

RDEPENDS_${PN} = "python3"