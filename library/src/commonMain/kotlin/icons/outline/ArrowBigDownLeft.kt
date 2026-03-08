package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ArrowBigDownLeft: ImageVector
    get() {
        if (_ArrowBigDownLeft != null) {
            return _ArrowBigDownLeft!!
        }
        _ArrowBigDownLeft = ImageVector.Builder(
            name = "Outline.ArrowBigDownLeft",
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
                moveTo(15.932f, 18.963f)
                curveToRelative(0.315f, 0.315f, -0.062f, 1.026f, -0.519f, 1.037f)
                horizontalLineTo(5.66f)
                curveToRelative(-0.58f, 0f, -0.871f, 0f, -1.093f, -0.113f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.454f, -0.454f)
                curveTo(4f, 19.213f, 4f, 18.922f, 4f, 18.34f)
                verticalLineTo(8.587f)
                curveToRelative(0.01f, -0.457f, 0.722f, -0.834f, 1.038f, -0.519f)
                lineToRelative(2.714f, 2.78f)
                curveToRelative(0.195f, 0.195f, 0.52f, 0.187f, 0.725f, -0.018f)
                lineToRelative(6.671f, -6.671f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.725f, -0.017f)
                lineToRelative(3.985f, 3.985f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.017f, 0.725f)
                lineToRelative(-6.671f, 6.671f)
                arcToRelative(0.513f, 0.513f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.017f, 0.725f)
                close()
            }
        }.build()

        return _ArrowBigDownLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBigDownLeft: ImageVector? = null
