md bin
md bin\native
md bin\native\izpack
copy "C:\Program Files\IzPack\bin\native\izpack\ShellLink.dll" bin\native\izpack\ShellLink.dll
call "C:\Program Files\IzPack\bin\compile.bat" "frinika-install.xml"
del bin\native\izpack\ShellLink.dll
rd bin\native\izpack
rd bin\native
rd bin
pause
