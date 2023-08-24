LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    git://github.com/ejaaskel/camera-gpio.git;branch=main;protocol=https \
    file://camera-gpio \
"

S = "${WORKDIR}/git"

inherit cmake update-rc.d
INITSCRIPT_NAME = "camera-gpio"
INITSCRIPT_PARAMS = "defaults 90 10"

SRCREV = "${AUTOREV}"

do_install:append() {
  install -d ${D}/${INIT_D_DIR}
  install -m 0755 ${WORKDIR}/camera-gpio ${D}${INIT_D_DIR}/camera-gpio
}
