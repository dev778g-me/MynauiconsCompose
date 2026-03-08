package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.LockCircle: ImageVector
    get() {
        if (_LockCircle != null) {
            return _LockCircle!!
        }
        _LockCircle = ImageVector.Builder(
            name = "Filled.LockCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.746f, 8.925f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(2.508f)
                verticalLineToRelative(-1.27f)
                curveToRelative(0f, -0.454f, -0.163f, -0.725f, -0.36f, -0.893f)
                curveToRelative(-0.216f, -0.182f, -0.53f, -0.29f, -0.88f, -0.283f)
                curveToRelative(-0.717f, 0.014f, -1.268f, 0.451f, -1.268f, 1.175f)
                moveTo(8.75f, 11.957f)
                curveToRelative(0f, -0.15f, 0.119f, -0.26f, 0.252f, -0.26f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.133f, 0f, 0.252f, 0.11f, 0.252f, 0.26f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.15f, -0.119f, 0.261f, -0.252f, 0.261f)
                horizontalLineTo(9.002f)
                arcToRelative(0.257f, 0.257f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.252f, -0.26f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(12.504f, -3.075f)
                curveToRelative(0f, -0.868f, -0.338f, -1.568f, -0.891f, -2.037f)
                curveToRelative(-0.537f, -0.454f, -1.224f, -0.65f, -1.877f, -0.637f)
                curveToRelative(-1.287f, 0.024f, -2.74f, 0.906f, -2.74f, 2.674f)
                verticalLineToRelative(1.271f)
                horizontalLineToRelative(-0.244f)
                curveToRelative(-0.974f, 0f, -1.752f, 0.795f, -1.752f, 1.761f)
                verticalLineToRelative(3.032f)
                curveToRelative(0f, 0.967f, 0.778f, 1.761f, 1.752f, 1.761f)
                horizontalLineToRelative(5.996f)
                curveToRelative(0.974f, 0f, 1.752f, -0.794f, 1.752f, -1.76f)
                verticalLineToRelative(-3.033f)
                curveToRelative(0f, -0.966f, -0.778f, -1.76f, -1.752f, -1.76f)
                horizontalLineToRelative(-0.244f)
                close()
            }
        }.build()

        return _LockCircle!!
    }

@Suppress("ObjectPropertyName")
private var _LockCircle: ImageVector? = null
