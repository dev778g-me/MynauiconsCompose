package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.ThermometerSun: ImageVector
    get() {
        if (_ThermometerSun != null) {
            return _ThermometerSun!!
        }
        _ThermometerSun = ImageVector.Builder(
            name = "Filled.ThermometerSun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.38f, 15f)
                verticalLineToRelative(-0.396f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                lineTo(15.88f, 15f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                moveToRelative(4.14f, -2.536f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.003f, -0.04f)
                lineToRelative(0.057f, 0.052f)
                lineToRelative(0.39f, 0.4f)
                lineToRelative(0.052f, 0.058f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.067f, 1.043f)
                lineToRelative(-0.057f, -0.052f)
                lineToRelative(-0.39f, -0.4f)
                lineToRelative(-0.051f, -0.058f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.063f, -1.003f)
                moveTo(21f, 8.25f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-0.392f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.5f)
                close()
                moveTo(18.955f, 4.023f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.016f, 1.101f)
                lineToRelative(-0.392f, 0.4f)
                lineToRelative(-0.056f, 0.052f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.015f, -1.1f)
                lineToRelative(0.39f, -0.4f)
                close()
                moveTo(14.381f, 3.4f)
                lineTo(14.381f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, 0f)
                verticalLineToRelative(0.4f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                moveTo(9.75f, 13.356f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.413f, 1.553f)
                curveToRelative(0.385f, 0.685f, 0.587f, 1.453f, 0.587f, 2.236f)
                lineToRelative(-0.006f, 0.226f)
                arcToRelative(4.54f, 4.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.358f, 3.003f)
                arcToRelative(4.82f, 4.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.28f, 1.375f)
                arcToRelative(4.84f, 4.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.338f, -1.23f)
                arcTo(4.56f, 4.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.27f, 17.58f)
                lineToRelative(-0.016f, -0.226f)
                arcTo(4.55f, 4.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.786f, 15f)
                arcToRelative(4.7f, 4.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.464f, -1.645f)
                lineTo(4.25f, 4.93f)
                curveToRelative(0f, -0.72f, 0.297f, -1.404f, 0.815f, -1.904f)
                arcTo(2.8f, 2.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 2.25f)
                lineToRelative(0.269f, 0.013f)
                curveToRelative(0.623f, 0.06f, 1.213f, 0.326f, 1.666f, 0.762f)
                curveToRelative(0.518f, 0.5f, 0.815f, 1.184f, 0.815f, 1.904f)
                close()
                moveTo(15.13f, 12.95f)
                curveToRelative(2.16f, 0f, 3.88f, -1.784f, 3.88f, -3.95f)
                reflectiveCurveToRelative(-1.72f, -3.95f, -3.88f, -3.95f)
                curveToRelative(-2.158f, 0f, -3.88f, 1.784f, -3.88f, 3.95f)
                reflectiveCurveToRelative(1.722f, 3.95f, 3.88f, 3.95f)
            }
        }.build()

        return _ThermometerSun!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerSun: ImageVector? = null
