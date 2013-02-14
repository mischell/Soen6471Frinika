REM WIX can be found at: http://wix.sourceforge.net/

set wix_path=C:\java\wix-2.0.4820.0-binaries

"%wix_path%\candle.exe" frinika.wix
"%wix_path%\light.exe" -out frinika-install.msi frinika.wixobj "%wix_path%\wixui.wixlib" -loc "%wix_path%\WixUI_en-us.wxl"
pause