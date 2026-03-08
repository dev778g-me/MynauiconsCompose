package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Flower: ImageVector
    get() {
        if (_Flower != null) {
            return _Flower!!
        }
        _Flower = ImageVector.Builder(
            name = "Outline.Flower",
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
                moveTo(11f, 10f)
                curveToRelative(-0.679f, -1.266f, -1.75f, -3.272f, -1.75f, -4.28f)
                curveTo(9.25f, 4.228f, 10.515f, 3f, 12f, 3f)
                reflectiveCurveToRelative(2.75f, 1.227f, 2.75f, 2.72f)
                curveToRelative(0f, 1.008f, -1.071f, 3.014f, -1.75f, 4.28f)
                moveToRelative(0.319f, 0.184f)
                curveToRelative(0.757f, -1.221f, 1.958f, -3.151f, 2.83f, -3.655f)
                curveToRelative(1.295f, -0.747f, 2.99f, -0.265f, 3.732f, 1.021f)
                curveToRelative(0.743f, 1.286f, 0.313f, 2.995f, -0.981f, 3.742f)
                curveToRelative(-0.873f, 0.504f, -3.145f, 0.579f, -4.581f, 0.624f)
                moveToRelative(0f, 0.368f)
                curveToRelative(1.435f, 0.045f, 3.708f, 0.12f, 4.58f, 0.624f)
                curveToRelative(1.295f, 0.747f, 1.725f, 2.456f, 0.982f, 3.742f)
                reflectiveCurveToRelative(-2.437f, 1.768f, -3.731f, 1.021f)
                curveToRelative(-0.873f, -0.504f, -2.074f, -2.434f, -2.831f, -3.655f)
                moveTo(13f, 14.2f)
                curveToRelative(0.679f, 1.266f, 1.75f, 3.272f, 1.75f, 4.28f)
                curveToRelative(0f, 1.494f, -1.264f, 2.72f, -2.75f, 2.72f)
                reflectiveCurveToRelative(-2.75f, -1.226f, -2.75f, -2.72f)
                curveToRelative(0f, -1.008f, 1.071f, -3.014f, 1.75f, -4.28f)
                moveToRelative(-0.319f, -0.184f)
                curveToRelative(-0.757f, 1.221f, -1.958f, 3.151f, -2.83f, 3.655f)
                curveToRelative(-1.295f, 0.747f, -2.99f, 0.265f, -3.732f, -1.021f)
                curveToRelative(-0.743f, -1.286f, -0.313f, -2.995f, 0.981f, -3.742f)
                curveToRelative(0.873f, -0.504f, 3.146f, -0.579f, 4.581f, -0.624f)
                moveToRelative(0f, -0.368f)
                curveToRelative(-1.435f, -0.045f, -3.708f, -0.12f, -4.58f, -0.624f)
                curveToRelative(-1.295f, -0.747f, -1.725f, -2.456f, -0.982f, -3.742f)
                reflectiveCurveTo(6.556f, 5.782f, 7.85f, 6.529f)
                curveToRelative(0.873f, 0.504f, 2.074f, 2.434f, 2.831f, 3.655f)
                moveTo(14f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 0f)
            }
        }.build()

        return _Flower!!
    }

@Suppress("ObjectPropertyName")
private var _Flower: ImageVector? = null
