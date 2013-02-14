How to build the frinika.zip and frinika-src.zip
------------------------------------------------

A good procedure is to first make the sourcerelease:

ant sourcerelease

This will put a frinika-src.zip file in the parent 
directory. Unzip this file and use this to build the 
frinika.zip, by entering the unzipped directory and 
type:

ant release

The frinika.zip is put in the parent dir. Test the
release and upload to sourceforge.net :)


