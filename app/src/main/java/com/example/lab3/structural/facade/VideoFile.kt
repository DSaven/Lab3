class VideoFile(val name: String) {
    val codecType: String = name.substring(name.indexOf(".") + 1)
}