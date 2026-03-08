package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ChatDots: ImageVector
    get() {
        if (_ChatDots != null) {
            return _ChatDots!!
        }
        _ChatDots = ImageVector.Builder(
            name = "Filled.ChatDots",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                arcToRelative(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.342f, -1.018f)
                curveToRelative(-0.21f, -0.104f, -0.523f, -0.114f, -1.01f, 0.005f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.729f, 0.22f)
                lineToRelative(-0.086f, 0.03f)
                curveToRelative(-0.22f, 0.074f, -0.46f, 0.154f, -0.683f, 0.214f)
                curveToRelative(-1.427f, 0.382f, -2.733f, -0.924f, -2.351f, -2.35f)
                curveToRelative(0.06f, -0.224f, 0.14f, -0.463f, 0.214f, -0.684f)
                lineToRelative(0.03f, -0.086f)
                curveToRelative(0.085f, -0.255f, 0.163f, -0.495f, 0.22f, -0.729f)
                curveToRelative(0.12f, -0.487f, 0.11f, -0.8f, 0.005f, -1.01f)
                arcTo(9.7f, 9.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 12f)
                moveToRelative(6.5f, 0.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(12.75f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
                moveTo(16.75f, 12.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                close()
            }
        }.build()

        return _ChatDots!!
    }

@Suppress("ObjectPropertyName")
private var _ChatDots: ImageVector? = null
