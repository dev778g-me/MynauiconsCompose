package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Shrub: ImageVector
    get() {
        if (_Shrub != null) {
            return _Shrub!!
        }
        _Shrub = ImageVector.Builder(
            name = "Outline.Shrub",
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
                moveToRelative(11.993f, 15.796f)
                lineToRelative(2.598f, -2.352f)
                moveToRelative(-4.162f, 0.782f)
                lineToRelative(1.564f, 0.782f)
                verticalLineTo(20.5f)
                moveToRelative(6.053f, -10.398f)
                curveToRelative(2.02f, -3.249f, -2.817f, -7.978f, -6.053f, -5.357f)
                curveToRelative(-3.07f, -2.482f, -8.177f, -1.031f, -6.052f, 2.392f)
                curveToRelative(-4.389f, 2.539f, -0.505f, 11.018f, 3.454f, 11.017f)
                horizontalLineToRelative(5.196f)
                curveToRelative(3.91f, -0.1f, 7.896f, -5.482f, 3.455f, -8.052f)
            }
        }.build()

        return _Shrub!!
    }

@Suppress("ObjectPropertyName")
private var _Shrub: ImageVector? = null
