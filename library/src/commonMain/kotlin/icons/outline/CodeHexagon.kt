package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CodeHexagon: ImageVector
    get() {
        if (_CodeHexagon != null) {
            return _CodeHexagon!!
        }
        _CodeHexagon = ImageVector.Builder(
            name = "Outline.CodeHexagon",
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
                moveTo(20.5f, 15.8f)
                verticalLineTo(8.2f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.944f, -1.645f)
                lineToRelative(-6.612f, -3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.888f, 0f)
                lineToRelative(-6.612f, 3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 8.2f)
                verticalLineToRelative(7.602f)
                arcToRelative(1.91f, 1.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.944f, 1.644f)
                lineToRelative(6.612f, 3.8f)
                arcToRelative(1.88f, 1.88f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.888f, 0f)
                lineToRelative(6.612f, -3.8f)
                arcTo(1.9f, 1.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 15.8f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveToRelative(14.908f, 9.7f)
                lineToRelative(0.132f, 0.131f)
                curveToRelative(1.022f, 1.023f, 1.534f, 1.534f, 1.534f, 2.169f)
                reflectiveCurveToRelative(-0.512f, 1.147f, -1.534f, 2.17f)
                lineToRelative(-0.132f, 0.13f)
                moveTo(13.072f, 8f)
                lineToRelative(-2.143f, 8f)
                moveTo(9.092f, 9.7f)
                lineToRelative(-0.132f, 0.131f)
                curveTo(7.938f, 10.854f, 7.427f, 11.365f, 7.427f, 12f)
                reflectiveCurveToRelative(0.51f, 1.147f, 1.533f, 2.17f)
                lineToRelative(0.132f, 0.13f)
            }
        }.build()

        return _CodeHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _CodeHexagon: ImageVector? = null
