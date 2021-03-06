DESCRIPTION = "Store and access your passwords safely"
HOMEPAGE = "https://pypi.python.org/pypi/keyring/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://CONTRIBUTORS.txt;md5=50793e96bcc5250698eddfef509a2061"

PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "fd50a2be4a44a78efb09a7c046b6410d"
SRC_URI[sha256sum] = "ac2b4dc17e6edfb804b09ade15df79f251522e442976ea0c8ea0051474502cf5"

inherit setuptools pypi

DEPENDS += " python-hgtools"
