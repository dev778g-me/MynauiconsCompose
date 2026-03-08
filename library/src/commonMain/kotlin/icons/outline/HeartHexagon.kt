package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.HeartHexagon: ImageVector
    get() {
        if (_HeartHexagon != null) {
            return _HeartHexagon!!
        }
        _HeartHexagon = ImageVector.Builder(
            name = "Outline.HeartHexagon",
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
                moveTo(10.291f, 9.5f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.781f, 1.781f)
                curveToRelative(0f, 1.969f, 3.375f, 4.219f, 3.375f, 4.219f)
                reflectiveCurveToRelative(3.375f, -2.25f, 3.375f, -4.219f)
                curveToRelative(0f, -1.219f, -0.797f, -1.781f, -1.781f, -1.781f)
                curveToRelative(-0.698f, 0f, -1.302f, 0.4f, -1.594f, 0.985f)
                arcToRelative(1.78f, 1.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.594f, -0.985f)
            }
        }.build()

        return _HeartHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _HeartHexagon: ImageVector? = null
