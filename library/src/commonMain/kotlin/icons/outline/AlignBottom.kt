package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AlignBottom: ImageVector
    get() {
        if (_AlignBottom != null) {
            return _AlignBottom!!
        }
        _AlignBottom = ImageVector.Builder(
            name = "Outline.AlignBottom",
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
                moveTo(10f, 14f)
                verticalLineTo(6f)
                curveToRelative(0f, -0.932f, 0f, -1.398f, -0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, -1.083f)
                curveTo(8.398f, 3f, 7.932f, 3f, 7f, 3f)
                reflectiveCurveToRelative(-1.398f, 0f, -1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, 1.083f)
                curveTo(4f, 4.602f, 4f, 5.068f, 4f, 6f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.932f, 0f, 1.398f, 0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, 1.083f)
                curveTo(5.602f, 17f, 6.068f, 17f, 7f, 17f)
                reflectiveCurveToRelative(1.398f, 0f, 1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, -1.083f)
                curveTo(10f, 15.398f, 10f, 14.932f, 10f, 14f)
                moveToRelative(10f, 0f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.932f, 0f, -1.398f, -0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, -1.083f)
                curveTo(18.398f, 7f, 17.932f, 7f, 17f, 7f)
                reflectiveCurveToRelative(-1.398f, 0f, -1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, 1.083f)
                curveTo(14f, 8.602f, 14f, 9.068f, 14f, 10f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.932f, 0f, 1.398f, 0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, 1.083f)
                curveTo(15.602f, 17f, 16.068f, 17f, 17f, 17f)
                reflectiveCurveToRelative(1.398f, 0f, 1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, -1.083f)
                curveTo(20f, 15.398f, 20f, 14.932f, 20f, 14f)
                moveToRelative(1f, 7f)
                horizontalLineTo(3f)
            }
        }.build()

        return _AlignBottom!!
    }

@Suppress("ObjectPropertyName")
private var _AlignBottom: ImageVector? = null
