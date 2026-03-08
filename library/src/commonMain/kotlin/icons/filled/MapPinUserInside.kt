package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.MapPinUserInside: ImageVector
    get() {
        if (_MapPinUserInside != null) {
            return _MapPinUserInside!!
        }
        _MapPinUserInside = ImageVector.Builder(
            name = "Filled.MapPinUserInside",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1.167f)
                curveToRelative(2.363f, 0f, 4.623f, 0.965f, 6.286f, 2.676f)
                curveToRelative(3.06f, 3.147f, 3.04f, 6.919f, 1.63f, 10.288f)
                curveToRelative(-1.393f, 3.33f, -4.163f, 6.363f, -6.822f, 8.339f)
                arcToRelative(1.83f, 1.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.188f, 0f)
                curveToRelative(-2.66f, -1.976f, -5.43f, -5.01f, -6.822f, -8.34f)
                curveToRelative(-1.41f, -3.368f, -1.43f, -7.14f, 1.63f, -10.287f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 1.167f)
                moveToRelative(2.138f, 9.689f)
                arcToRelative(2.833f, 2.833f, 0f, isMoreThanHalf = true, isPositiveArc = false, -4.276f, 0f)
                quadToRelative(-0.246f, 0.15f, -0.467f, 0.34f)
                curveToRelative(-0.752f, 0.645f, -1.228f, 1.602f, -1.228f, 2.804f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.666f, 0f)
                curveToRelative(0f, -0.729f, 0.274f, -1.219f, 0.647f, -1.54f)
                curveToRelative(0.391f, -0.334f, 0.94f, -0.523f, 1.52f, -0.523f)
                reflectiveCurveToRelative(1.129f, 0.189f, 1.52f, 0.524f)
                curveToRelative(0.373f, 0.32f, 0.647f, 0.81f, 0.647f, 1.539f)
                arcToRelative(0.833f, 0.833f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.666f, 0f)
                curveToRelative(0f, -1.202f, -0.476f, -2.16f, -1.228f, -2.805f)
                arcToRelative(3.6f, 3.6f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.467f, -0.34f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.167f, 9f)
                arcToRelative(1.167f, 1.167f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.334f, 0f)
                arcToRelative(1.167f, 1.167f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.334f, 0f)
            }
        }.build()

        return _MapPinUserInside!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinUserInside: ImageVector? = null
