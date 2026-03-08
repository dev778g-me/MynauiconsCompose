package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AlignRight: ImageVector
    get() {
        if (_AlignRight != null) {
            return _AlignRight!!
        }
        _AlignRight = ImageVector.Builder(
            name = "Outline.AlignRight",
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
                moveTo(14f, 14f)
                horizontalLineTo(6f)
                curveToRelative(-0.932f, 0f, -1.398f, 0f, -1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, 1.083f)
                curveTo(3f, 15.602f, 3f, 16.068f, 3f, 17f)
                reflectiveCurveToRelative(0f, 1.398f, 0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, 1.083f)
                curveTo(4.602f, 20f, 5.068f, 20f, 6f, 20f)
                horizontalLineToRelative(8f)
                curveToRelative(0.932f, 0f, 1.398f, 0f, 1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, -1.083f)
                curveTo(17f, 18.398f, 17f, 17.932f, 17f, 17f)
                reflectiveCurveToRelative(0f, -1.398f, -0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, -1.083f)
                curveTo(15.398f, 14f, 14.932f, 14f, 14f, 14f)
                moveToRelative(0f, -10f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.932f, 0f, -1.398f, 0f, -1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, 1.083f)
                curveTo(7f, 5.602f, 7f, 6.068f, 7f, 7f)
                reflectiveCurveToRelative(0f, 1.398f, 0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, 1.083f)
                curveTo(8.602f, 10f, 9.068f, 10f, 10f, 10f)
                horizontalLineToRelative(4f)
                curveToRelative(0.932f, 0f, 1.398f, 0f, 1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, -1.083f)
                curveTo(17f, 8.398f, 17f, 7.932f, 17f, 7f)
                reflectiveCurveToRelative(0f, -1.398f, -0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, -1.083f)
                curveTo(15.398f, 4f, 14.932f, 4f, 14f, 4f)
                moveToRelative(7f, 17f)
                verticalLineTo(3f)
            }
        }.build()

        return _AlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRight: ImageVector? = null
