package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.FourCircle: ImageVector
    get() {
        if (_FourCircle != null) {
            return _FourCircle!!
        }
        _FourCircle = ImageVector.Builder(
            name = "Filled.FourCircle",
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
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(11.056f, -3.8f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.445f, -0.4f)
                curveToRelative(-0.383f, 1.377f, -1.16f, 2.668f, -1.863f, 3.633f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.185f, 1.44f)
                lineToRelative(-0.072f, 0.075f)
                lineToRelative(-0.018f, 0.018f)
                lineToRelative(-0.004f, 0.004f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.531f, 1.28f)
                horizontalLineToRelative(3f)
                verticalLineTo(16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.5f, 0f)
                verticalLineToRelative(-1.75f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.5f)
                horizontalLineToRelative(-0.5f)
                verticalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, 0f)
                verticalLineToRelative(0.75f)
                horizontalLineToRelative(-1.366f)
                quadToRelative(0.159f, -0.203f, 0.326f, -0.433f)
                curveToRelative(0.755f, -1.035f, 1.645f, -2.494f, 2.096f, -4.116f)
            }
        }.build()

        return _FourCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FourCircle: ImageVector? = null
