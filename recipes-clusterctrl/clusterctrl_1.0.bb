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

# Use patched version until figure out how to handle QA error missing python (due to python3 installed and script uses /usr/bin/python)
#SRCREV = "b1530274206291d993185951608e4f4ea3d11e49"
#SRC_URI = "git://github.com/burtyb/clusterhat-image.git"

SRCREV = "b5256c11b2bf48b7077c0ef710a6f623efce4865"
SRC_URI = "git://github.com/ihatetoregister/clusterhat-image.git"

S = "${WORKDIR}/git"

FILES_${PN} = "/usr/*"

do_compile() {
}

do_install() {
    #install -d ${D}/${sbindir}
    #install -m 0755 ${S}/files/usr/sbin/* ${D}/${sbindir}

    #install -d ${D}/${datadir}/clusterctrl/
    #install -m 0755 ${S}/files/usr/share/clusterctrl/* ${D}/${datadir}/clusterctrl/
    
    #install -d ${D}/${datadir}/clusterctrl/python/
    #install -m 0755 ${S}/files/usr/share/clusterctrl/python/* ${D}/${datadir}/clusterctrl/python/

    install -d ${D}/${sbindir}
    install -d ${D}/${datadir}
    cp -r --no-dereference --preserve=mode,links -v ${S}/files/usr/sbin/* ${D}/${sbindir}
    cp -r --no-dereference --preserve=mode,links -v ${S}/files/usr/share/* ${D}/${datadir}
}

RDEPENDS_${PN} = " bash python3-core python3-smbus rpi-gpio"
