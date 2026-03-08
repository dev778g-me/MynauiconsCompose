package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Heading6: ImageVector
    get() {
        if (_Heading6 != null) {
            return _Heading6!!
        }
        _Heading6 = ImageVector.Builder(
            name = "Filled.Heading6",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.75f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(8f)
                lineTo(12.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(11.5f, 9.5f)
                curveToRelative(0f, -2.32f, 1.531f, -4.5f, 3.75f, -4.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.095f, 0f, -2.25f, 1.178f, -2.25f, 3f)
                verticalLineToRelative(0.298f)
                curveToRelative(0.53f, -0.296f, 1.14f, -0.423f, 1.75f, -0.423f)
                curveToRelative(0.824f, 0f, 1.646f, 0.231f, 2.27f, 0.797f)
                curveToRelative(0.639f, 0.576f, 0.98f, 1.42f, 0.98f, 2.453f)
                curveToRelative(0f, 1.975f, -1.308f, 3.875f, -3.25f, 3.875f)
                reflectiveCurveToRelative(-3.25f, -1.9f, -3.25f, -3.875f)
                close()
                moveTo(16.75f, 16.375f)
                curveToRelative(0f, 1.477f, 0.931f, 2.375f, 1.75f, 2.375f)
                reflectiveCurveToRelative(1.75f, -0.898f, 1.75f, -2.375f)
                curveToRelative(0f, -0.692f, -0.218f, -1.1f, -0.485f, -1.341f)
                curveToRelative(-0.28f, -0.253f, -0.708f, -0.409f, -1.265f, -0.409f)
                reflectiveCurveToRelative(-0.985f, 0.156f, -1.265f, 0.409f)
                curveToRelative(-0.267f, 0.242f, -0.485f, 0.649f, -0.485f, 1.341f)
            }
        }.build()

        return _Heading6!!
    }

@Suppress("ObjectPropertyName")
private var _Heading6: ImageVector? = null
