package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.AlignVertical: ImageVector
    get() {
        if (_AlignVertical != null) {
            return _AlignVertical!!
        }
        _AlignVertical = ImageVector.Builder(
            name = "Outline.AlignVertical",
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
                moveTo(3f, 12f)
                horizontalLineToRelative(1f)
                moveToRelative(17f, 0f)
                horizontalLineToRelative(-1f)
                moveToRelative(-10f, 0f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.932f, 0f, -1.398f, -0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, -1.083f)
                curveTo(8.398f, 5f, 7.932f, 5f, 7f, 5f)
                reflectiveCurveToRelative(-1.398f, 0f, -1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.083f, 1.083f)
                curveTo(4f, 6.602f, 4f, 7.068f, 4f, 8f)
                verticalLineToRelative(4f)
                moveToRelative(6f, 0f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.932f, 0f, 1.398f, -0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.083f, 1.083f)
                curveTo(8.398f, 19f, 7.932f, 19f, 7f, 19f)
                reflectiveCurveToRelative(-1.398f, 0f, -1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.083f, -1.083f)
                curveTo(4f, 17.398f, 4f, 16.932f, 4f, 16f)
                verticalLineToRelative(-4f)
                moveToRelative(6f, 0f)
                horizontalLineToRelative(4f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.932f, 0f, 1.398f, 0.152f, 1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, 1.083f)
                curveTo(15.602f, 17f, 16.068f, 17f, 17f, 17f)
                reflectiveCurveToRelative(1.398f, 0f, 1.765f, -0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.083f, -1.083f)
                curveTo(20f, 15.398f, 20f, 14.932f, 20f, 14f)
                verticalLineToRelative(-2f)
                moveToRelative(-6f, 0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.932f, 0f, -1.398f, 0.152f, -1.765f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.083f, -1.083f)
                curveTo(15.602f, 7f, 16.068f, 7f, 17f, 7f)
                reflectiveCurveToRelative(1.398f, 0f, 1.765f, 0.152f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.083f, 1.083f)
                curveTo(20f, 8.602f, 20f, 9.068f, 20f, 10f)
                verticalLineToRelative(2f)
            }
        }.build()

        return _AlignVertical!!
    }

@Suppress("ObjectPropertyName")
private var _AlignVertical: ImageVector? = null
