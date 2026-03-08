package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AlignHorizontal: ImageVector
    get() {
        if (_AlignHorizontal != null) {
            return _AlignHorizontal!!
        }
        _AlignHorizontal = ImageVector.Builder(
            name = "Outline.AlignHorizontal",
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
                verticalLineToRelative(-1f)
                moveToRelative(0f, -17f)
                verticalLineToRelative(1f)
                moveToRelative(0f, 10f)
                horizontalLineTo(8f)
                curveToRelative(-0.932f, 0f, -1.398f, 0f, -1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, 1.083f)
                curveTo(5f, 15.602f, 5f, 16.068f, 5f, 17f)
                reflectiveCurveToRelative(0f, 1.398f, 0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, 1.083f)
                curveTo(6.602f, 20f, 7.068f, 20f, 8f, 20f)
                horizontalLineToRelative(4f)
                moveToRelative(0f, -6f)
                horizontalLineToRelative(4f)
                curveToRelative(0.932f, 0f, 1.398f, 0f, 1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.083f, 1.083f)
                curveTo(19f, 15.602f, 19f, 16.068f, 19f, 17f)
                reflectiveCurveToRelative(0f, 1.398f, -0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.083f, 1.083f)
                curveTo(17.398f, 20f, 16.932f, 20f, 16f, 20f)
                horizontalLineToRelative(-4f)
                moveToRelative(0f, -6f)
                verticalLineToRelative(-4f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(2f)
                curveToRelative(0.932f, 0f, 1.398f, 0f, 1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, -1.083f)
                curveTo(17f, 8.398f, 17f, 7.932f, 17f, 7f)
                reflectiveCurveToRelative(0f, -1.398f, -0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, -1.083f)
                curveTo(15.398f, 4f, 14.932f, 4f, 14f, 4f)
                horizontalLineToRelative(-2f)
                moveToRelative(0f, 6f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.932f, 0f, -1.398f, 0f, -1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.083f, -1.083f)
                curveTo(7f, 8.398f, 7f, 7.932f, 7f, 7f)
                reflectiveCurveToRelative(0f, -1.398f, 0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.083f, -1.083f)
                curveTo(8.602f, 4f, 9.068f, 4f, 10f, 4f)
                horizontalLineToRelative(2f)
            }
        }.build()

        return _AlignHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _AlignHorizontal: ImageVector? = null
