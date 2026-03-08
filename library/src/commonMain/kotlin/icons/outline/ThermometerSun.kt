package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ThermometerSun: ImageVector
    get() {
        if (_ThermometerSun != null) {
            return _ThermometerSun!!
        }
        _ThermometerSun = ImageVector.Builder(
            name = "Outline.ThermometerSun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.155f, 13.86f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.114f, -0.116f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.041f, -0.155f)
                verticalLineToRelative(-8.66f)
                curveToRelative(0f, -0.512f, -0.21f, -1.002f, -0.586f, -1.364f)
                arcTo(2.04f, 2.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3f)
                curveToRelative(-0.53f, 0f, -1.04f, 0.203f, -1.414f, 0.565f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 4.929f)
                verticalLineToRelative(8.66f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.041f, 0.155f)
                arcToRelative(0.3f, 0.3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.114f, 0.116f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.396f, 1.493f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.445f, 1.965f)
                arcToRelative(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.266f, 2.644f)
                arcToRelative(4.1f, 4.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.82f, 1.037f)
                arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.77f, -1.16f)
                arcTo(3.8f, 3.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17.145f)
                curveToRelative(0f, -0.652f, -0.168f, -1.294f, -0.49f, -1.867f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.355f, -1.417f)
                moveTo(15.13f, 3f)
                verticalLineToRelative(0.4f)
                moveToRelative(0f, 11.203f)
                verticalLineTo(15f)
                moveTo(21f, 9f)
                horizontalLineToRelative(-0.391f)
                moveToRelative(-1.174f, -4.4f)
                lineToRelative(-0.392f, 0.4f)
                moveToRelative(0.392f, 8.4f)
                lineToRelative(-0.391f, -0.4f)
                moveToRelative(-0.783f, -4f)
                curveToRelative(0f, 1.767f, -1.402f, 3.2f, -3.13f, 3.2f)
                curveTo(13.4f, 12.2f, 12f, 10.767f, 12f, 9f)
                reflectiveCurveToRelative(1.402f, -3.2f, 3.13f, -3.2f)
                curveToRelative(1.73f, 0f, 3.13f, 1.433f, 3.13f, 3.2f)
            }
        }.build()

        return _ThermometerSun!!
    }

@Suppress("ObjectPropertyName")
private var _ThermometerSun: ImageVector? = null
