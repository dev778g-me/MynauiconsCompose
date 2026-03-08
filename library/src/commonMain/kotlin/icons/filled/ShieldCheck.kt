package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ShieldCheck: ImageVector
    get() {
        if (_ShieldCheck != null) {
            return _ShieldCheck!!
        }
        _ShieldCheck = ImageVector.Builder(
            name = "Filled.ShieldCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.226f, 2.49f)
                lineToRelative(-0.61f, 0.417f)
                arcToRelative(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.235f, 1.92f)
                arcToRelative(1.264f, 1.264f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.131f, 1.26f)
                verticalLineToRelative(4.93f)
                curveToRelative(0f, 2.541f, 1.335f, 4.853f, 2.79f, 6.63f)
                curveToRelative(1.466f, 1.793f, 3.136f, 3.142f, 3.977f, 3.773f)
                arcToRelative(1.63f, 1.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.966f, 0f)
                curveToRelative(0.841f, -0.63f, 2.511f, -1.98f, 3.977f, -3.772f)
                curveToRelative(1.455f, -1.778f, 2.79f, -4.09f, 2.79f, -6.63f)
                verticalLineTo(6.086f)
                curveToRelative(0f, -0.64f, -0.478f, -1.194f, -1.131f, -1.26f)
                arcToRelative(11.3f, 11.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.234f, -1.92f)
                lineToRelative(-0.61f, -0.417f)
                arcToRelative(1.37f, 1.37f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.55f, 0f)
                moveToRelative(2.955f, 6.402f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.169f, 1.047f)
                lineToRelative(-2.1f, 2.907f)
                arcToRelative(0.974f, 0.974f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.522f, 0.072f)
                lineToRelative(-1.034f, -1.182f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.128f, -0.988f)
                lineToRelative(0.6f, 0.684f)
                lineToRelative(1.712f, -2.371f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.047f, -0.169f)
            }
        }.build()

        return _ShieldCheck!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldCheck: ImageVector? = null
