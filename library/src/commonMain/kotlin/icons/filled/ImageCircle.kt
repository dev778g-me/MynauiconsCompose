package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ImageCircle: ImageVector
    get() {
        if (_ImageCircle != null) {
            return _ImageCircle!!
        }
        _ImageCircle = ImageVector.Builder(
            name = "Filled.ImageCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.75f, 9f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.16f, 10.78f)
                curveToRelative(-5.667f, -0.42f, -10.375f, 3.7f, -10.41f, 9.16f)
                curveToRelative(0.715f, 0.202f, 1.47f, 0.31f, 2.25f, 0.31f)
                arcToRelative(8.25f, 8.25f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.16f, -9.47f)
                moveTo(8.268f, 19.36f)
                curveToRelative(0.06f, -1.046f, 0.268f, -2.043f, 0.603f, -2.974f)
                curveToRelative(-1.082f, -1.593f, -2.886f, -2.639f, -4.935f, -2.636f)
                arcToRelative(8.26f, 8.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.332f, 5.61f)
                moveTo(2.25f, 12f)
                curveToRelative(0f, -5.385f, 4.365f, -9.75f, 9.75f, -9.75f)
                reflectiveCurveToRelative(9.75f, 4.365f, 9.75f, 9.75f)
                reflectiveCurveToRelative(-4.365f, 9.75f, -9.75f, 9.75f)
                reflectiveCurveTo(2.25f, 17.385f, 2.25f, 12f)
                moveToRelative(4f, -3f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 5.5f, 0f)
                arcToRelative(2.75f, 2.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.5f, 0f)
                moveToRelative(1.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.5f, 0f)
            }
        }.build()

        return _ImageCircle!!
    }

@Suppress("ObjectPropertyName")
private var _ImageCircle: ImageVector? = null
