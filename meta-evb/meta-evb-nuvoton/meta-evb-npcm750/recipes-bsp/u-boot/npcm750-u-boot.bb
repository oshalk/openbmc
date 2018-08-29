# TODO: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

DEPENDS += "u-boot-nuvoton"
DEPENDS += "u-boot-fw-utils-nuvoton"

SRC_URI = "https://github.com/Nuvoton-Israel/u-boot/releases/download/v2015.10-npcm7xx-20180608/u-boot.bin"
SRC_URI[md5sum] = "dd893393017b7503e009697afeff38b6"

SRCREV = "${AUTOREV}"

inherit deploy

do_deploy () {
	install -d ${DEPLOYDIR}
	install -m 644 ${WORKDIR}/u-boot.bin ${DEPLOYDIR}/u-boot.bin
}

addtask deploy before do_build after do_compile
