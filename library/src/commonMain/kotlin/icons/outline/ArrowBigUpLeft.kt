package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowBigUpLeft: ImageVector
    get() {
        if (_ArrowBigUpLeft != null) {
            return _ArrowBigUpLeft!!
        }
        _ArrowBigUpLeft = ImageVector.Builder(
            name = "Outline.ArrowBigUpLeft",
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
                moveTo(15.932f, 5.038f)
                curveToRelative(0.315f, -0.316f, -0.062f, -1.027f, -0.519f, -1.038f)
                horizontalLineTo(5.66f)
                curveToRelative(-0.58f, 0f, -0.871f, 0f, -1.093f, 0.113f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.454f, 0.453f)
                curveTo(4f, 4.789f, 4f, 5.08f, 4f, 5.66f)
                verticalLineToRelative(9.753f)
                curveToRelative(0.01f, 0.457f, 0.722f, 0.834f, 1.038f, 0.519f)
                lineToRelative(2.714f, -2.78f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.725f, 0.018f)
                lineToRelative(6.671f, 6.671f)
                curveToRelative(0.205f, 0.205f, 0.53f, 0.213f, 0.725f, 0.017f)
                lineToRelative(3.985f, -3.985f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.017f, -0.725f)
                lineTo(13.17f, 8.477f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.017f, -0.725f)
                close()
            }
        }.build()

        return _ArrowBigUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigUpLeft: ImageVector? = null
