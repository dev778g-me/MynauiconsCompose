package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Scissors: ImageVector
    get() {
        if (_Scissors != null) {
            return _Scissors!!
        }
        _Scissors = ImageVector.Builder(
            name = "Filled.Scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.75f, 6.92f)
                curveToRelative(0f, 0.675f, -0.215f, 1.297f, -0.579f, 1.807f)
                lineToRelative(3.619f, 2.376f)
                lineToRelative(8.798f, -5.778f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.824f, 1.254f)
                lineToRelative(-9.196f, 6.038f)
                lineToRelative(-0.029f, 0.019f)
                lineToRelative(-4.016f, 2.637f)
                curveToRelative(0.364f, 0.51f, 0.579f, 1.132f, 0.579f, 1.808f)
                curveToRelative(0f, 1.773f, -1.478f, 3.169f, -3.25f, 3.169f)
                reflectiveCurveToRelative(-3.25f, -1.396f, -3.25f, -3.17f)
                curveToRelative(0f, -1.773f, 1.478f, -3.169f, 3.25f, -3.169f)
                curveToRelative(0.53f, 0f, 1.035f, 0.126f, 1.482f, 0.349f)
                lineTo(10.423f, 12f)
                lineTo(6.982f, 9.74f)
                arcToRelative(3.3f, 3.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.482f, 0.349f)
                curveToRelative(-1.772f, 0f, -3.25f, -1.396f, -3.25f, -3.17f)
                curveToRelative(0f, -1.773f, 1.478f, -3.169f, 3.25f, -3.169f)
                reflectiveCurveToRelative(3.25f, 1.396f, 3.25f, 3.17f)
                moveToRelative(6.596f, 6.518f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, -0.824f, 1.254f)
                lineToRelative(6.066f, 3.983f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.824f, -1.253f)
                close()
            }
        }.build()

        return _Scissors!!
    }

@Suppress("ObjectPropertyName")
private var _Scissors: ImageVector? = null
