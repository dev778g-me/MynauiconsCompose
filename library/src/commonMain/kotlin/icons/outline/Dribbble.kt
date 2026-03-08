package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Dribbble: ImageVector
    get() {
        if (_Dribbble != null) {
            return _Dribbble!!
        }
        _Dribbble = ImageVector.Builder(
            name = "Outline.Dribbble",
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
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -18f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 18f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3.07f, 10.875f)
                curveToRelative(1.7f, 0.102f, 6.2f, 0.195f, 9.08f, -1.035f)
                reflectiveCurveToRelative(5.358f, -3.492f, 6.208f, -4.21f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.625f, 3.654f)
                curveToRelative(1.409f, 1.3f, 4.482f, 4.61f, 5.625f, 7.896f)
                reflectiveCurveToRelative(1.566f, 7.326f, 1.827f, 8.476f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 12f)
                curveToRelative(-1.313f, 0f, -4.936f, -0.495f, -8.178f, 0.928f)
                curveToRelative(-3.522f, 1.547f, -6.072f, 3.946f, -7.184f, 5.438f)
            }
        }.build()

        return _Dribbble!!
    }

@Suppress("ObjectPropertyName")
private var _Dribbble: ImageVector? = null
