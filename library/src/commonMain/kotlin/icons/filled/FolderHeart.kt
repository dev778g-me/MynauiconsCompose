package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FolderHeart: ImageVector
    get() {
        if (_FolderHeart != null) {
            return _FolderHeart!!
        }
        _FolderHeart = ImageVector.Builder(
            name = "Filled.FolderHeart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3.25f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.25f, 6f)
                verticalLineToRelative(12f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 20.75f)
                horizontalLineToRelative(14f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.75f, 18f)
                lineTo(21.75f, 9f)
                arcTo(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 6.25f)
                horizontalLineToRelative(-7.34f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.826f, -0.312f)
                lineTo(8.562f, 3.936f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.817f, -0.686f)
                close()
                moveTo(11.58f, 16.871f)
                lineTo(11.57f, 16.865f)
                lineTo(11.538f, 16.843f)
                lineTo(11.421f, 16.761f)
                arcToRelative(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.63f, -1.343f)
                curveToRelative(-0.446f, -0.427f, -0.913f, -0.939f, -1.273f, -1.494f)
                curveToRelative(-0.354f, -0.546f, -0.649f, -1.201f, -0.649f, -1.9f)
                curveToRelative(0f, -1.335f, 0.945f, -2.198f, 1.967f, -2.433f)
                curveToRelative(0.713f, -0.165f, 1.53f, -0.038f, 2.158f, 0.458f)
                curveToRelative(1.506f, -1.229f, 4.137f, -0.316f, 4.137f, 1.975f)
                curveToRelative(0f, 0.699f, -0.295f, 1.354f, -0.65f, 1.9f)
                curveToRelative(-0.36f, 0.556f, -0.826f, 1.067f, -1.272f, 1.494f)
                arcToRelative(14.6f, 14.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.747f, 1.425f)
                lineToRelative(-0.032f, 0.022f)
                lineToRelative(-0.01f, 0.006f)
                lineToRelative(-0.002f, 0.002f)
                horizontalLineToRelative(-0.001f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.833f, 0f)
                horizontalLineToRelative(-0.002f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.63f, 12.024f)
                curveToRelative(0f, -1.068f, -1.475f, -1.43f, -1.96f, -0.462f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.34f, 0f)
                curveToRelative(-0.225f, -0.448f, -0.687f, -0.618f, -1.157f, -0.51f)
                curveToRelative(-0.465f, 0.107f, -0.804f, 0.456f, -0.804f, 0.972f)
                curveToRelative(0f, 0.287f, 0.128f, 0.653f, 0.408f, 1.084f)
                curveToRelative(0.274f, 0.422f, 0.652f, 0.844f, 1.052f, 1.227f)
                curveToRelative(0.396f, 0.38f, 0.796f, 0.705f, 1.098f, 0.936f)
                lineToRelative(0.073f, 0.055f)
                lineToRelative(0.073f, -0.055f)
                curveToRelative(0.302f, -0.23f, 0.702f, -0.556f, 1.098f, -0.936f)
                curveToRelative(0.4f, -0.383f, 0.778f, -0.805f, 1.052f, -1.227f)
                curveToRelative(0.28f, -0.431f, 0.408f, -0.797f, 0.408f, -1.084f)
            }
        }.build()

        return _FolderHeart!!
    }

@Suppress("ObjectPropertyName")
private var _FolderHeart: ImageVector? = null
