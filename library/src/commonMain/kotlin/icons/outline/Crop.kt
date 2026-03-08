package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Crop: ImageVector
    get() {
        if (_Crop != null) {
            return _Crop!!
        }
        _Crop = ImageVector.Builder(
            name = "Outline.Crop",
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
                moveTo(6.6f, 3f)
                verticalLineToRelative(9.6f)
                curveToRelative(0f, 1.68f, 0f, 2.52f, 0.327f, 3.162f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.311f, 1.311f)
                curveToRelative(0.642f, 0.327f, 1.482f, 0.327f, 3.162f, 0.327f)
                horizontalLineTo(21f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.2f, 6.6f)
                horizontalLineToRelative(3.4f)
                curveToRelative(1.68f, 0f, 2.52f, 0f, 3.162f, 0.327f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.311f, 1.311f)
                curveToRelative(0.327f, 0.642f, 0.327f, 1.482f, 0.327f, 3.162f)
                verticalLineToRelative(3.4f)
                moveTo(6.6f, 6.6f)
                horizontalLineTo(3f)
                moveTo(17.4f, 21f)
                verticalLineToRelative(-3.6f)
            }
        }.build()

        return _Crop!!
    }

@Suppress("ObjectPropertyName")
private var _Crop: ImageVector? = null
