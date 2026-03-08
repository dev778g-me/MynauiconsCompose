package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Cupcake: ImageVector
    get() {
        if (_Cupcake != null) {
            return _Cupcake!!
        }
        _Cupcake = ImageVector.Builder(
            name = "Outline.Cupcake",
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
                moveToRelative(5f, 14f)
                lineToRelative(0.804f, 5.626f)
                curveTo(5.948f, 20.636f, 6.308f, 21f, 7.385f, 21f)
                horizontalLineTo(10f)
                moveToRelative(-5f, -7f)
                horizontalLineToRelative(4f)
                moveToRelative(-4f, 0f)
                curveToRelative(-1.303f, -0.604f, -2f, -2.236f, -2f, -3.666f)
                curveToRelative(0f, -1.536f, 1.03f, -2.85f, 2.49f, -3.397f)
                arcTo(0.79f, 0.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6.208f)
                curveToRelative(0f, -1.265f, 1.12f, -2.291f, 2.5f, -2.291f)
                curveToRelative(0.668f, 0f, 1.31f, 0.322f, 1.941f, -0.066f)
                arcTo(5.83f, 5.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 3f)
                curveTo(16.538f, 3f, 19f, 5.257f, 19f, 8.042f)
                curveToRelative(0f, 1.256f, 2f, 1.594f, 2f, 3.208f)
                curveToRelative(0f, 1.277f, -0.712f, 2.44f, -2f, 2.75f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(-4f)
                moveToRelative(4f, 0f)
                lineToRelative(-0.804f, 5.628f)
                curveTo(18.044f, 20.693f, 17.635f, 21f, 16.615f, 21f)
                horizontalLineTo(14f)
                moveToRelative(1f, -7f)
                horizontalLineTo(9f)
                moveToRelative(6f, 0f)
                lineToRelative(-1f, 7f)
                moveToRelative(-5f, -7f)
                lineToRelative(1f, 7f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4f)
            }
        }.build()

        return _Cupcake!!
    }

@Suppress("ObjectPropertyName")
private var _Cupcake: ImageVector? = null
