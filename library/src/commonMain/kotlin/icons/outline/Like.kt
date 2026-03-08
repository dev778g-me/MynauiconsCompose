package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Like: ImageVector
    get() {
        if (_Like != null) {
            return _Like!!
        }
        _Like = ImageVector.Builder(
            name = "Outline.Like",
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
                moveTo(14.54f, 10.105f)
                horizontalLineToRelative(5.533f)
                curveToRelative(2.546f, 0f, -0.764f, 10.895f, -2.588f, 10.895f)
                horizontalLineTo(4.964f)
                arcTo(0.956f, 0.956f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 20.053f)
                verticalLineToRelative(-9.385f)
                curveToRelative(0f, -0.347f, 0.193f, -0.666f, 0.502f, -0.832f)
                curveTo(6.564f, 8.73f, 8.983f, 7.824f, 10.18f, 5.707f)
                lineToRelative(1.28f, -2.266f)
                arcTo(0.87f, 0.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.222f, 3f)
                curveToRelative(3.18f, 0f, 2.237f, 4.63f, 1.805f, 6.47f)
                arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.513f, 0.635f)
            }
        }.build()

        return _Like!!
    }

@Suppress("ObjectPropertyName")
private var _Like: ImageVector? = null
