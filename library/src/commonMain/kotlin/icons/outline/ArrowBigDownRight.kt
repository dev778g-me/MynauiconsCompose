package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowBigDownRight: ImageVector
    get() {
        if (_ArrowBigDownRight != null) {
            return _ArrowBigDownRight!!
        }
        _ArrowBigDownRight = ImageVector.Builder(
            name = "Outline.ArrowBigDownRight",
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
                moveTo(8.068f, 18.963f)
                curveToRelative(-0.315f, 0.315f, 0.062f, 1.026f, 0.519f, 1.037f)
                horizontalLineToRelative(9.753f)
                curveToRelative(0.58f, 0f, 0.872f, 0f, 1.093f, -0.113f)
                curveToRelative(0.196f, -0.1f, 0.354f, -0.258f, 0.454f, -0.454f)
                curveToRelative(0.113f, -0.221f, 0.113f, -0.512f, 0.113f, -1.093f)
                verticalLineTo(8.587f)
                curveToRelative(-0.01f, -0.457f, -0.722f, -0.834f, -1.038f, -0.519f)
                lineToRelative(-2.714f, 2.78f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.725f, -0.018f)
                lineTo(8.852f, 4.16f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.725f, -0.017f)
                lineTo(4.142f, 8.127f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.017f, 0.725f)
                lineToRelative(6.671f, 6.671f)
                curveToRelative(0.205f, 0.205f, 0.213f, 0.53f, 0.017f, 0.725f)
                close()
            }
        }.build()

        return _ArrowBigDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigDownRight: ImageVector? = null
