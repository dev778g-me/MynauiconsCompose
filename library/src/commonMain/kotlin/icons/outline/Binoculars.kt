package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Binoculars: ImageVector
    get() {
        if (_Binoculars != null) {
            return _Binoculars!!
        }
        _Binoculars = ImageVector.Builder(
            name = "Outline.Binoculars",
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
                moveTo(17.616f, 19.75f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.634f, -3.645f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.634f, -3.645f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.634f, 3.645f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.634f, 3.645f)
                moveToRelative(-11.232f, 0f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.634f, -3.645f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.634f, -3.645f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.634f, 3.645f)
                arcToRelative(3.64f, 3.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.634f, 3.645f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.018f, 16.105f)
                verticalLineTo(6.16f)
                curveToRelative(0f, -3.004f, -3.364f, -2.042f, -4.17f, 0f)
                curveToRelative(0f, 0f, -2.004f, 6.294f, -2.933f, 8.849f)
                moveToRelative(7.103f, -3.519f)
                reflectiveCurveToRelative(0.681f, 0.674f, 1.982f, 0.674f)
                reflectiveCurveToRelative(1.982f, -0.674f, 1.982f, -0.674f)
                moveToRelative(-3.964f, 3.645f)
                reflectiveCurveToRelative(0.681f, 0.674f, 1.982f, 0.674f)
                reflectiveCurveToRelative(1.982f, -0.674f, 1.982f, -0.674f)
                moveToRelative(0f, 0.971f)
                verticalLineTo(6.16f)
                curveToRelative(0f, -3.004f, 3.364f, -2.042f, 4.17f, 0f)
                curveToRelative(0f, 0f, 2.004f, 6.294f, 2.933f, 8.849f)
            }
        }.build()

        return _Binoculars!!
    }

@Suppress("ObjectPropertyName")
private var _Binoculars: ImageVector? = null
