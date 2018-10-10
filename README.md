# MATL_Log_Convert_
Convert Olympus MATL log files to Fiji txt files for stitching in Fiji https://imagej.net/Image_Stitching.

### Installing

Create a new folder "Emory ICI" in your plugins folder of your ImageJ/Fiji software. Place each of the plugins you need into this folder and they'll appear under Emory ICI in the plugins menu.

### Executing program

Select Plugins -> ICI Emory -> MATL Log Convert

Click MATL log file [...] browse button and locate MATL log file.
Click Text file [...] browse button.  The located log file will be shown.  Change at minimum, .log to .txt.

In Fiji (Plugins -> Stitching -> Grid/Collection Stitching), use Type option of "Positions from file" option and provide .txt file created.

### Author(s)

Neil Anthony
[@nranthony](https://twitter.com/nranthony)

### Version History

* 1
    * First version - 2D only
* 2
    * Fixed scaling bug, added 3D check box option

### Known Issues

Path entry box does not accept text edits, only changes via [...] browse button

