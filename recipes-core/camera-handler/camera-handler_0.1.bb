LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    git://github.com/ejaaskel/camera-handler.git;branch=main;protocol=https \
"

S = "${WORKDIR}/git"

inherit autotools

RDEPENDS:${PN} = "fswebcam"

SRCREV = "${AUTOREV}"
