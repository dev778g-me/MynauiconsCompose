package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Pocket: ImageVector
    get() {
        if (_Pocket != null) {
            return _Pocket!!
        }
        _Pocket = ImageVector.Builder(
            name = "Outline.Pocket",
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
                moveToRelative(9f, 10.25f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.8f, 3f)
                horizontalLineToRelative(14.4f)
                curveToRelative(0.477f, 0f, 0.935f, 0.199f, 1.273f, 0.553f)
                reflectiveCurveTo(21f, 4.388f, 21f, 4.89f)
                verticalLineToRelative(6.667f)
                curveToRelative(0f, 2.504f, -0.948f, 4.907f, -2.636f, 6.678f)
                reflectiveCurveTo(14.387f, 21f, 12f, 21f)
                arcToRelative(8.6f, 8.6f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.444f, -0.719f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.92f, -2.047f)
                curveTo(3.948f, 16.463f, 3f, 14.06f, 3f, 11.556f)
                verticalLineTo(4.889f)
                curveToRelative(0f, -0.501f, 0.19f, -0.982f, 0.527f, -1.336f)
                arcTo(1.76f, 1.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.8f, 3f)
            }
        }.build()

        return _Pocket!!
    }

@Suppress("ObjectPropertyName")
private var _Pocket: ImageVector? = null
