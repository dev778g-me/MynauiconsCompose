package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowBigUpRight: ImageVector
    get() {
        if (_ArrowBigUpRight != null) {
            return _ArrowBigUpRight!!
        }
        _ArrowBigUpRight = ImageVector.Builder(
            name = "Outline.ArrowBigUpRight",
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
                moveTo(8.068f, 5.038f)
                curveTo(7.753f, 4.722f, 8.13f, 4.01f, 8.587f, 4f)
                horizontalLineToRelative(9.753f)
                curveToRelative(0.581f, 0f, 0.872f, 0f, 1.093f, 0.113f)
                curveToRelative(0.196f, 0.1f, 0.354f, 0.258f, 0.454f, 0.453f)
                curveTo(20f, 4.789f, 20f, 5.08f, 20f, 5.66f)
                verticalLineToRelative(9.753f)
                curveToRelative(-0.01f, 0.457f, -0.722f, 0.834f, -1.038f, 0.519f)
                lineToRelative(-2.714f, -2.78f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.725f, 0.018f)
                lineToRelative(-6.671f, 6.67f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.725f, 0.017f)
                lineToRelative(-3.985f, -3.985f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.017f, -0.725f)
                lineToRelative(6.671f, -6.671f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.018f, -0.725f)
                close()
            }
        }.build()

        return _ArrowBigUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUpRight: ImageVector? = null
