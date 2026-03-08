package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Link: ImageVector
    get() {
        if (_Link != null) {
            return _Link!!
        }
        _Link = ImageVector.Builder(
            name = "Filled.Link",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.372f, 3.58f)
                curveToRelative(1.708f, -1.709f, 4.465f, -1.799f, 6.156f, -0.108f)
                reflectiveCurveToRelative(1.601f, 4.448f, -0.107f, 6.156f)
                lineToRelative(-3.902f, 3.902f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(3.901f, -3.902f)
                curveToRelative(1.165f, -1.165f, 1.171f, -2.971f, 0.107f, -4.035f)
                curveToRelative(-1.063f, -1.064f, -2.87f, -1.058f, -4.035f, 0.107f)
                lineTo(11.53f, 8.542f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                close()
                moveTo(15.53f, 8.47f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.06f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.06f, -1.06f)
                lineToRelative(6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.555f, 11.531f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.06f, -1.062f)
                lineTo(3.604f, 14.35f)
                curveToRelative(-1.703f, 1.698f, -1.862f, 4.296f, -0.12f, 6.118f)
                curveToRelative(1.783f, 1.863f, 4.477f, 1.578f, 6.154f, -0.094f)
                lineToRelative(3.892f, -3.881f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.06f, -1.062f)
                lineTo(8.58f, 19.31f)
                curveToRelative(-1.189f, 1.186f, -2.908f, 1.272f, -4.01f, 0.12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.191f, -0.217f)
                curveToRelative(-0.939f, -1.172f, -0.81f, -2.71f, 0.285f, -3.802f)
                close()
            }
        }.build()

        return _Link!!
    }

@Suppress("ObjectPropertyName")
private var _Link: ImageVector? = null
